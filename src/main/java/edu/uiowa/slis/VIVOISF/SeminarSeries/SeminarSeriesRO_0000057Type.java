package edu.uiowa.slis.VIVOISF.SeminarSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeminarSeriesRO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeminarSeriesRO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SeminarSeriesRO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeminarSeriesRO_0000057Iterator theSeminarSeriesRO_0000057Iterator = (SeminarSeriesRO_0000057Iterator)findAncestorWithClass(this, SeminarSeriesRO_0000057Iterator.class);
			pageContext.getOut().print(theSeminarSeriesRO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SeminarSeries for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing SeminarSeries for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

