package edu.uiowa.slis.VIVOISF.ConferenceSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceSeriesRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceSeriesRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceSeriesRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceSeriesRO_0000057Iterator theConferenceSeriesRO_0000057Iterator = (ConferenceSeriesRO_0000057Iterator)findAncestorWithClass(this, ConferenceSeriesRO_0000057Iterator.class);
			pageContext.getOut().print(theConferenceSeriesRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferenceSeries for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferenceSeries for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

