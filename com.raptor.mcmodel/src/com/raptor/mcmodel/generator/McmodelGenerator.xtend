/*
 * generated by Xtext 2.21.0
 */
package com.raptor.mcmodel.generator

import com.google.inject.Inject
import com.raptor.mcmodel.mcmodel.*
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.conversion.impl.STRINGValueConverter
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static com.raptor.mcmodel.mcmodel.McmodelPackage.Literals.*
import static extension com.raptor.mcmodel.util.McmodelUtils.*
import java.util.regex.Pattern
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.List
import java.util.EnumMap

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class McmodelGenerator extends AbstractGenerator {

	@Inject STRINGValueConverter stringValueConverter

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(resource.fileNameNoExt + '.json', compileModel(resource.allContents.filter(Model).next))
	}
	
	def compileModel(Model it) '''
		{
			«IF parent !== null»
				"parent": «parent.asLiteral»«IF displayDefined || ambientocclusionDefined || texturesDefined || guiLightDefined || elementsDefined || overridesDefined»,«ENDIF»
			«ENDIF»
			«IF ambientocclusionDefined»
				"ambientocclusion": «ambientocclusion»«IF displayDefined || texturesDefined || guiLightDefined || elementsDefined || overridesDefined»,«ENDIF»
			«ENDIF»
			«IF guiLightDefined»
				"gui_light": «guiLight»«IF displayDefined || texturesDefined || elementsDefined || overridesDefined»,«ENDIF»
			«ENDIF»
			«IF texturesDefined»
				"textures": {
					«FOR texture : textures.sortWith[sortTextureNames($0.name, $1.name)] SEPARATOR ','»
						«texture.name.asLiteral»: «texture.value.asLiteral»
					«ENDFOR»
				}«IF displayDefined || elementsDefined || overridesDefined»,«ENDIF»
			«ENDIF»
			«IF elementsDefined»
				"elements": [
					«FOR element : elements SEPARATOR ','»
						«compileElement(element)»
					«ENDFOR»
				]«IF displayDefined || overridesDefined»,«ENDIF»
			«ENDIF»
			«IF displayDefined»
				"display": {
					«FOR feature : display.features SEPARATOR ','»
						«feature.key.asLiteral»: «compileMorph(feature.value)»
					«ENDFOR»
				}«IF overridesDefined»,«ENDIF»
			«ENDIF»
			«IF overridesDefined»
				"overrides": [
					«FOR override : overrides SEPARATOR ','»
						«compileItemOverride(override)»
					«ENDFOR»
				]
			«ENDIF»
		}
	'''
	
	def compileElement(Element it) '''
		{
			"from": «compileVec3d(from)»,
			"to": «compileVec3d(to)»,
			«IF rotation !== null»
			"rotation": {
				"origin": «compileVec3d(rotation.origin)»,
				"axis": «rotation.axis.literal.asLiteral»,
				"angle": «rotation.angle»«IF rotation.rescaleDefined»,«ENDIF»
				«IF rotation.rescaleDefined»
				"rescale": «rotation.rescale»
				«ENDIF»
			},
			«ENDIF»
			«IF shadeDefined»
			"shade": «shade»,
			«ENDIF»
			"faces": {
				«FOR face : allFaces SEPARATOR ','»
					«face.key.literal.asLiteral»: «compileFace(face.value)»
				«ENDFOR»
			}
		}
	'''
	
	def compileMorph(Morph it) '''
		{
			«IF rotation !== null»
				"rotation": «compileVec3d(rotation)»«IF translation !== null || scale !== null»,«ENDIF»
			«ENDIF»
			«IF translation !== null»
				"translation": «compileVec3d(translation)»«IF scale !== null»,«ENDIF»
			«ENDIF»
			«IF scale !== null»
				"scale": «compileVec3d(scale)»
			«ENDIF»
		}
	'''
	
	def compileItemOverride(ItemOverride it) '''
		{
			"predicate": «compileOverridePredicate(predicate).trim()»,
			"model": «model.asLiteral»
		}
	'''
	
	def String compileOverridePredicate(OverridePredicate it) '''
		«IF it.isSmall»
			{ «IF angleDefined»"angle": «angle»«ELSEIF blockingDefined»"blocking": «blocking? '1' : '0'»«ELSEIF brokenDefined»"broken": «broken? '1' : '0'»«ELSEIF castDefined»"cast": «cast? '1' : '0'»«ELSEIF cooldownDefined»"cooldown": «cooldown»«ELSEIF damageDefined»"damage": «damage»«ELSEIF damagedDefined»"damaged": «damaged? '1' : '0'»«ELSEIF lefthandedDefined»"lefthanded": «lefthanded? '1' : '0'»«ELSEIF pullDefined»"pull": «pull»«ELSEIF pullingDefined»"pulling": «pulling? '1' : '0'»«ELSEIF throwingDefined»"throwing": «throwing? '1' : '0'»«ELSEIF timeDefined»"time": «time»«ELSEIF customModelDataDefined»"custom_model_data": «customModelData»«ENDIF» }
		«ELSE»
			{
				«IF angleDefined»
					"angle": «angle»«IF blockingDefined || brokenDefined || castDefined || cooldownDefined || damageDefined || damagedDefined || lefthandedDefined || pullDefined || pullingDefined || throwingDefined || timeDefined || customModelDataDefined»,«ENDIF»
				«ENDIF»
				«IF blockingDefined»
					"blocking": «blocking? '1' : '0'»«IF brokenDefined || castDefined || cooldownDefined || damageDefined || damagedDefined || lefthandedDefined || pullDefined || pullingDefined || throwingDefined || timeDefined || customModelDataDefined»,«ENDIF»
				«ENDIF»
				«IF brokenDefined»
					"broken": «broken? '1' : '0'»«IF castDefined || cooldownDefined || damageDefined || damagedDefined || lefthandedDefined || pullDefined || pullingDefined || throwingDefined || timeDefined || customModelDataDefined»,«ENDIF»
				«ENDIF»
				«IF castDefined»
					"cast": «cast? '1' : '0'»«IF cooldownDefined || damageDefined || damagedDefined || lefthandedDefined || pullDefined || pullingDefined || throwingDefined || timeDefined || customModelDataDefined»,«ENDIF»
				«ENDIF»
				«IF cooldownDefined»
					"cooldown": «cooldown»«IF damageDefined || damagedDefined || lefthandedDefined || pullDefined || pullingDefined || throwingDefined || timeDefined || customModelDataDefined»,«ENDIF»
				«ENDIF»
				«IF damageDefined»
					"damage": «damage»«IF damagedDefined || lefthandedDefined || pullDefined || pullingDefined || throwingDefined || timeDefined || customModelDataDefined»,«ENDIF»
				«ENDIF»
				«IF damagedDefined»
					"damaged": «damaged? '1' : '0'»«IF lefthandedDefined || pullDefined || pullingDefined || throwingDefined || timeDefined || customModelDataDefined»,«ENDIF»
				«ENDIF»
				«IF lefthandedDefined»
					"lefthanded": «lefthanded? '1' : '0'»«IF pullDefined || pullingDefined || throwingDefined || timeDefined || customModelDataDefined»,«ENDIF»
				«ENDIF»
				«IF pullDefined»
					"pull": «pull»«IF pullingDefined || throwingDefined || timeDefined || customModelDataDefined»,«ENDIF»
				«ENDIF»
				«IF pullingDefined»
					"pulling": «pulling? '1' : '0'»«IF throwingDefined || timeDefined || customModelDataDefined»,«ENDIF»
				«ENDIF»
				«IF throwingDefined»
					"throwing": «throwing? '1' : '0'»«IF timeDefined || customModelDataDefined»,«ENDIF»
				«ENDIF»
				«IF timeDefined»
					"time": «time»«IF customModelDataDefined»,«ENDIF»
				«ENDIF»
				«IF customModelDataDefined»
					"custom_model_data": «customModelData»
				«ENDIF»
			}
		«ENDIF»
	'''
	
	def compileFace(Face it) '''{ "texture": «texture.asLiteral»«IF uv !== null», "uv": «compileVec4d(uv)»«ENDIF»«IF cullfaceDefined», "cullface": «cullface.literal.asLiteral»«ENDIF»«IF rotationDefined», "rotation": «rotation»«ENDIF»«IF tintindexDefined», "tintindex": «tintindex»«ENDIF» }'''
	
	def compileVec3d(Vec3d it) '''[«x», «y», «z»]'''
	
	def compileVec4d(Vec4d it) '''[«x1», «y1», «x2», «y2»]'''
	
	def dispatch formatJson(MCJsonString it) '''«value.asLiteral»'''
	
	def dispatch formatJson(MCJsonBoolean it) '''«value»'''
	
	def dispatch formatJson(MCJsonIntegral it) '''«value»'''
	
	def dispatch formatJson(MCJsonFloatingPoint it) '''«value»'''
	
	def dispatch formatJson(MCJsonNull it) '''null'''
	
	def dispatch formatJson(MCJsonArray it) {
		if (elements.isEmpty) {
			'''[]'''
		} else if (elements.stream.anyMatch[isComplicated]) {
			'''
			[
				«FOR element : elements SEPARATOR ','»
				«formatJson(element)»
				«ENDFOR»
			]
			'''
		} else {
			'''[«FOR element : elements SEPARATOR ', '»«formatJson(element)»«ENDFOR»]'''
		}
	} 
	
	def dispatch formatJson(MCJsonObject it) {
		if (entries.isEmpty) {
			'''{}'''
		} else {
			'''
			{
				«FOR entry : entries SEPARATOR ','»
				«entry.name.asLiteral»: «formatJson(entry.value)»
				«ENDFOR»
			}
			'''
		}
	}
	
	def dispatch boolean isComplicated(MCJsonObject it) { entries.size > 0 }
	
	def dispatch boolean isComplicated(MCJsonArray it) { elements.size > 0 }
	
	def dispatch boolean isComplicated(MCJsonValue it) { false }
	
	def asLiteral(String str) { stringValueConverter.toString(str) }
	
	def sortTextureNames(String str1, String str2) {
		if (str1 == "particle") {
			-1
		} else if (str2 == "particle") {
			1
		} else if (str1.isLayerTextureName) {
			if (str2.isLayerTextureName) {
				str1 <=> str2
			} else {
				-1
			}
		} else if (str2.isLayerTextureName) {
			1
		} else {
			str1 <=> str2
		}
	}
	
	static val LAYER_TEXTURE_REGEX = Pattern.compile('''layer[0-9]+''')
	
	def static isLayerTextureName(String str) { LAYER_TEXTURE_REGEX.matcher(str).matches() }
	
	def getFeatures(Display it) {
		val results = new ArrayList<Pair<String, Morph>>(8)
		for (feature : DISPLAY$FEATURES) {
			val value = it.eGet(feature) as Morph
			if (value !== null) {
				results += (feature.name -> value) 
			}
		}
		return results
	}
	
	def getAllFaces(Element it) {
		val map = new EnumMap<EnumFace, Face>(EnumFace)
		if (defaultFace !== null) {
			for (side : EnumFace.VALUES) {
				map.put(side, defaultFace)
			}
		}
		for (face : faces) {
			for (side : face.sides) {
				map.put(side, face.face)
			}
		}
		return map.entrySet.sortBy[key]
	}
	
}
