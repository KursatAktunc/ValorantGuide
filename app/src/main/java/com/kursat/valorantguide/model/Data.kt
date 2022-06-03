package com.kursat.valorantguide.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Data (

  @SerializedName("uuid"                      ) var uuid                      : String?              = null,
  @SerializedName("displayName"               ) var displayName               : String?              = null,
  @SerializedName("description"               ) var description               : String?              = null,
  @SerializedName("developerName"             ) var developerName             : String?              = null,
  @SerializedName("characterTags"             ) var characterTags             : ArrayList<String>    = arrayListOf(),
  @SerializedName("displayIcon"               ) var displayIcon               : String?              = null,
  @SerializedName("displayIconSmall"          ) var displayIconSmall          : String?              = null,
  @SerializedName("bustPortrait"              ) var bustPortrait              : String?              = null,
  @SerializedName("fullPortrait"              ) var fullPortrait              : String?              = null,
  @SerializedName("fullPortraitV2"            ) var fullPortraitV2            : String?              = null,
  @SerializedName("killfeedPortrait"          ) var killfeedPortrait          : String?              = null,
  @SerializedName("background"                ) var background                : String?              = null,
  @SerializedName("backgroundGradientColors"  ) var backgroundGradientColors  : ArrayList<String>    = arrayListOf(),
  @SerializedName("assetPath"                 ) var assetPath                 : String?              = null,
  @SerializedName("isFullPortraitRightFacing" ) var isFullPortraitRightFacing : Boolean?             = null,
  @SerializedName("isPlayableCharacter"       ) var isPlayableCharacter       : Boolean?             = null,
  @SerializedName("isAvailableForTest"        ) var isAvailableForTest        : Boolean?             = null,
  @SerializedName("isBaseContent"             ) var isBaseContent             : Boolean?             = null,
  @SerializedName("role"                      ) var role                      : Role?                = Role(),
  @SerializedName("abilities"                 ) var abilities                 : ArrayList<Abilities> = arrayListOf(),
  @SerializedName("voiceLine"                 ) var voiceLine                 : VoiceLine?           = VoiceLine()

): Serializable