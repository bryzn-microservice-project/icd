################################################################
#                                                              #
#                             ICD                              #
#                                                              #
################################################################


mvn jsonschema2pojo:generate

@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX", timezone = "UTC")