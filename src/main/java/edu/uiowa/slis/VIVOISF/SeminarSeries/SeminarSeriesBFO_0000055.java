package edu.uiowa.slis.VIVOISF.SeminarSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeminarSeriesBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeminarSeriesBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(SeminarSeriesBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeminarSeriesBFO_0000055Iterator theSeminarSeriesBFO_0000055Iterator = (SeminarSeriesBFO_0000055Iterator)findAncestorWithClass(this, SeminarSeriesBFO_0000055Iterator.class);
			pageContext.getOut().print(theSeminarSeriesBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing SeminarSeries for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing SeminarSeries for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

