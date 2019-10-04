require 'json'

package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name         = package['name']
  s.version      = package['version']
  s.summary      = package['description']
  s.author       = package['author']
  s.homepage     = package['homepage']
  s.license      = package['license']
  s.source       = { :git => 'https://github.com/doomsower/react-native-zxcvbn.git', :tag => "v#{s.version}" }

  s.platform     = :ios, "9.0"
  s.source_files = "ios/**/*.{h,m}"

  s.dependency 'React'
  s.dependency 'zxcvbn-ios'
end
