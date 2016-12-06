package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			if (!theReport.commitNeeded) {
				pageContext.getOut().print(theReport.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Report for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			return theReport.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Report for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			theReport.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Report for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for placeOfPublication tag ");
		}
	}
}

