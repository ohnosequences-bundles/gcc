package ohnosequences.statika

import ohnosequences.statika._
import sys.process._

case object GCC extends Bundle() {

  val metadata = generated.metadata.GCC

  def install[D <: AnyDistribution](distribution: D): InstallResults =
    Seq("yum", "install", "gcc", "-y") ->- success(metadata+" is installed")

}
