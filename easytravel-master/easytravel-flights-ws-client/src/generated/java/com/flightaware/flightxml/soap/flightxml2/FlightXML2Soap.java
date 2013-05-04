package com.flightaware.flightxml.soap.flightxml2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-03-24T16:06:34.958+01:00
 * Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", name = "FlightXML2Soap")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface FlightXML2Soap {

    @WebResult(name = "CountAirportOperationsResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "CountAirportOperations", action = "FlightXML2:CountAirportOperations")
    public CountAirportOperationsResults countAirportOperations(
        @WebParam(partName = "parameters", name = "CountAirportOperationsRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        CountAirportOperationsRequest parameters
    );

    @WebResult(name = "AirportInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "AirportInfo", action = "FlightXML2:AirportInfo")
    public AirportInfoResults airportInfo(
        @WebParam(partName = "parameters", name = "AirportInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        AirportInfoRequest parameters
    );

    @WebResult(name = "SearchResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "Search", action = "FlightXML2:Search")
    public SearchResults search(
        @WebParam(partName = "parameters", name = "SearchRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        SearchRequest parameters
    );

    @WebResult(name = "FlightInfoExResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "FlightInfoEx", action = "FlightXML2:FlightInfoEx")
    public FlightInfoExResults flightInfoEx(
        @WebParam(partName = "parameters", name = "FlightInfoExRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        FlightInfoExRequest parameters
    );

    @WebResult(name = "SetMaximumResultSizeResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "SetMaximumResultSize", action = "FlightXML2:SetMaximumResultSize")
    public SetMaximumResultSizeResults setMaximumResultSize(
        @WebParam(partName = "parameters", name = "SetMaximumResultSizeRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        SetMaximumResultSizeRequest parameters
    );

    @WebResult(name = "SearchCountResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "SearchCount", action = "FlightXML2:SearchCount")
    public SearchCountResults searchCount(
        @WebParam(partName = "parameters", name = "SearchCountRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        SearchCountRequest parameters
    );

    @WebResult(name = "GetHistoricalTrackResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "GetHistoricalTrack", action = "FlightXML2:GetHistoricalTrack")
    public GetHistoricalTrackResults getHistoricalTrack(
        @WebParam(partName = "parameters", name = "GetHistoricalTrackRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        GetHistoricalTrackRequest parameters
    );

    @WebResult(name = "TafResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "Taf", action = "FlightXML2:Taf")
    public TafResults taf(
        @WebParam(partName = "parameters", name = "TafRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        TafRequest parameters
    );

    @WebResult(name = "BlockIdentCheckResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "BlockIdentCheck", action = "FlightXML2:BlockIdentCheck")
    public BlockIdentCheckResults blockIdentCheck(
        @WebParam(partName = "parameters", name = "BlockIdentCheckRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        BlockIdentCheckRequest parameters
    );

    @WebResult(name = "InboundFlightInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "InboundFlightInfo", action = "FlightXML2:InboundFlightInfo")
    public InboundFlightInfoResults inboundFlightInfo(
        @WebParam(partName = "parameters", name = "InboundFlightInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        InboundFlightInfoRequest parameters
    );

    @WebResult(name = "AirlineInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "AirlineInfo", action = "FlightXML2:AirlineInfo")
    public AirlineInfoResults airlineInfo(
        @WebParam(partName = "parameters", name = "AirlineInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        AirlineInfoRequest parameters
    );

    @WebResult(name = "DepartedResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "Departed", action = "FlightXML2:Departed")
    public DepartedResults departed(
        @WebParam(partName = "parameters", name = "DepartedRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        DepartedRequest parameters
    );

    @WebResult(name = "MapFlightResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "MapFlight", action = "FlightXML2:MapFlight")
    public MapFlightResults mapFlight(
        @WebParam(partName = "parameters", name = "MapFlightRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        MapFlightRequest parameters
    );

    @WebResult(name = "DecodeRouteResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "DecodeRoute", action = "FlightXML2:DecodeRoute")
    public DecodeRouteResults decodeRoute(
        @WebParam(partName = "parameters", name = "DecodeRouteRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        DecodeRouteRequest parameters
    );

    @WebResult(name = "GetAlertsResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "GetAlerts", action = "FlightXML2:GetAlerts")
    public GetAlertsResults getAlerts(
        @WebParam(partName = "parameters", name = "GetAlertsRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        GetAlertsRequest parameters
    );

    @WebResult(name = "RoutesBetweenAirportsExResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "RoutesBetweenAirportsEx", action = "FlightXML2:RoutesBetweenAirportsEx")
    public RoutesBetweenAirportsExResults routesBetweenAirportsEx(
        @WebParam(partName = "parameters", name = "RoutesBetweenAirportsExRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        RoutesBetweenAirportsExRequest parameters
    );

    @WebResult(name = "MetarExResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "MetarEx", action = "FlightXML2:MetarEx")
    public MetarExResults metarEx(
        @WebParam(partName = "parameters", name = "MetarExRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        MetarExRequest parameters
    );

    @WebResult(name = "ArrivedResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "Arrived", action = "FlightXML2:Arrived")
    public ArrivedResults arrived(
        @WebParam(partName = "parameters", name = "ArrivedRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        ArrivedRequest parameters
    );

    @WebResult(name = "FleetScheduledResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "FleetScheduled", action = "FlightXML2:FleetScheduled")
    public FleetScheduledResults fleetScheduled(
        @WebParam(partName = "parameters", name = "FleetScheduledRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        FleetScheduledRequest parameters
    );

    @WebResult(name = "DecodeFlightRouteResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "DecodeFlightRoute", action = "FlightXML2:DecodeFlightRoute")
    public DecodeFlightRouteResults decodeFlightRoute(
        @WebParam(partName = "parameters", name = "DecodeFlightRouteRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        DecodeFlightRouteRequest parameters
    );

    @WebResult(name = "SearchBirdseyeInFlightResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "SearchBirdseyeInFlight", action = "FlightXML2:SearchBirdseyeInFlight")
    public SearchBirdseyeInFlightResults searchBirdseyeInFlight(
        @WebParam(partName = "parameters", name = "SearchBirdseyeInFlightRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        SearchBirdseyeInFlightRequest parameters
    );

    @WebResult(name = "LatLongsToHeadingResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "LatLongsToHeading", action = "FlightXML2:LatLongsToHeading")
    public LatLongsToHeadingResults latLongsToHeading(
        @WebParam(partName = "parameters", name = "LatLongsToHeadingRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        LatLongsToHeadingRequest parameters
    );

    @WebResult(name = "ScheduledResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "Scheduled", action = "FlightXML2:Scheduled")
    public ScheduledResults scheduled(
        @WebParam(partName = "parameters", name = "ScheduledRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        ScheduledRequest parameters
    );

    @WebResult(name = "GetLastTrackResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "GetLastTrack", action = "FlightXML2:GetLastTrack")
    public GetLastTrackResults getLastTrack(
        @WebParam(partName = "parameters", name = "GetLastTrackRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        GetLastTrackRequest parameters
    );

    @WebResult(name = "AircraftTypeResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "AircraftType", action = "FlightXML2:AircraftType")
    public AircraftTypeResults aircraftType(
        @WebParam(partName = "parameters", name = "AircraftTypeRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        AircraftTypeRequest parameters
    );

    @WebResult(name = "RegisterAlertEndpointResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "RegisterAlertEndpoint", action = "FlightXML2:RegisterAlertEndpoint")
    public RegisterAlertEndpointResults registerAlertEndpoint(
        @WebParam(partName = "parameters", name = "RegisterAlertEndpointRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        RegisterAlertEndpointRequest parameters
    );

    @WebResult(name = "MapFlightExResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "MapFlightEx", action = "FlightXML2:MapFlightEx")
    public MapFlightExResults mapFlightEx(
        @WebParam(partName = "parameters", name = "MapFlightExRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        MapFlightExRequest parameters
    );

    @WebResult(name = "GetFlightIDResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "GetFlightID", action = "FlightXML2:GetFlightID")
    public GetFlightIDResults getFlightID(
        @WebParam(partName = "parameters", name = "GetFlightIDRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        GetFlightIDRequest parameters
    );

    @WebResult(name = "RoutesBetweenAirportsResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "RoutesBetweenAirports", action = "FlightXML2:RoutesBetweenAirports")
    public RoutesBetweenAirportsResults routesBetweenAirports(
        @WebParam(partName = "parameters", name = "RoutesBetweenAirportsRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        RoutesBetweenAirportsRequest parameters
    );

    @WebResult(name = "DeleteAlertResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "DeleteAlert", action = "FlightXML2:DeleteAlert")
    public DeleteAlertResults deleteAlert(
        @WebParam(partName = "parameters", name = "DeleteAlertRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        DeleteAlertRequest parameters
    );

    @WebResult(name = "AllAirportsResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "AllAirports", action = "FlightXML2:AllAirports")
    public AllAirportsResults allAirports(
        @WebParam(partName = "parameters", name = "AllAirportsRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        AllAirportsRequest parameters
    );

    @WebResult(name = "InFlightInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "InFlightInfo", action = "FlightXML2:InFlightInfo")
    public InFlightInfoResults inFlightInfo(
        @WebParam(partName = "parameters", name = "InFlightInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        InFlightInfoRequest parameters
    );

    @WebResult(name = "MetarResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "Metar", action = "FlightXML2:Metar")
    public MetarResults metar(
        @WebParam(partName = "parameters", name = "MetarRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        MetarRequest parameters
    );

    @WebResult(name = "FleetArrivedResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "FleetArrived", action = "FlightXML2:FleetArrived")
    public FleetArrivedResults fleetArrived(
        @WebParam(partName = "parameters", name = "FleetArrivedRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        FleetArrivedRequest parameters
    );

    @WebResult(name = "AirlineFlightSchedulesResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "AirlineFlightSchedules", action = "FlightXML2:AirlineFlightSchedules")
    public AirlineFlightSchedulesResults airlineFlightSchedules(
        @WebParam(partName = "parameters", name = "AirlineFlightSchedulesRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        AirlineFlightSchedulesRequest parameters
    );

    @WebResult(name = "TailOwnerResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "TailOwner", action = "FlightXML2:TailOwner")
    public TailOwnerResults tailOwner(
        @WebParam(partName = "parameters", name = "TailOwnerRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        TailOwnerRequest parameters
    );

    @WebResult(name = "LatLongsToDistanceResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "LatLongsToDistance", action = "FlightXML2:LatLongsToDistance")
    public LatLongsToDistanceResults latLongsToDistance(
        @WebParam(partName = "parameters", name = "LatLongsToDistanceRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        LatLongsToDistanceRequest parameters
    );

    @WebResult(name = "CountAllEnrouteAirlineOperationsResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "CountAllEnrouteAirlineOperations", action = "FlightXML2:CountAllEnrouteAirlineOperations")
    public CountAllEnrouteAirlineOperationsResults countAllEnrouteAirlineOperations(
        @WebParam(partName = "parameters", name = "CountAllEnrouteAirlineOperationsRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        CountAllEnrouteAirlineOperationsRequest parameters
    );

    @WebResult(name = "AirlineInsightResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "AirlineInsight", action = "FlightXML2:AirlineInsight")
    public AirlineInsightResults airlineInsight(
        @WebParam(partName = "parameters", name = "AirlineInsightRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        AirlineInsightRequest parameters
    );

    @WebResult(name = "SearchBirdseyePositionsResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "SearchBirdseyePositions", action = "FlightXML2:SearchBirdseyePositions")
    public SearchBirdseyePositionsResults searchBirdseyePositions(
        @WebParam(partName = "parameters", name = "SearchBirdseyePositionsRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        SearchBirdseyePositionsRequest parameters
    );

    @WebResult(name = "NTafResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "NTaf", action = "FlightXML2:NTaf")
    public NTafResults nTaf(
        @WebParam(partName = "parameters", name = "NTafRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        NTafRequest parameters
    );

    @WebResult(name = "FlightInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "FlightInfo", action = "FlightXML2:FlightInfo")
    public FlightInfoResults flightInfo(
        @WebParam(partName = "parameters", name = "FlightInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        FlightInfoRequest parameters
    );

    @WebResult(name = "EnrouteResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "Enroute", action = "FlightXML2:Enroute")
    public EnrouteResults enroute(
        @WebParam(partName = "parameters", name = "EnrouteRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        EnrouteRequest parameters
    );

    @WebResult(name = "AllAirlinesResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "AllAirlines", action = "FlightXML2:AllAirlines")
    public AllAirlinesResults allAirlines(
        @WebParam(partName = "parameters", name = "AllAirlinesRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        AllAirlinesRequest parameters
    );

    @WebResult(name = "AirlineFlightInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "AirlineFlightInfo", action = "FlightXML2:AirlineFlightInfo")
    public AirlineFlightInfoResults airlineFlightInfo(
        @WebParam(partName = "parameters", name = "AirlineFlightInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        AirlineFlightInfoRequest parameters
    );

    @WebResult(name = "ZipcodeInfoResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "ZipcodeInfo", action = "FlightXML2:ZipcodeInfo")
    public ZipcodeInfoResults zipcodeInfo(
        @WebParam(partName = "parameters", name = "ZipcodeInfoRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        ZipcodeInfoRequest parameters
    );

    @WebResult(name = "SetAlertResults", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2", partName = "parameters")
    @WebMethod(operationName = "SetAlert", action = "FlightXML2:SetAlert")
    public SetAlertResults setAlert(
        @WebParam(partName = "parameters", name = "SetAlertRequest", targetNamespace = "http://flightxml.flightaware.com/soap/FlightXML2")
        SetAlertRequest parameters
    );
}
