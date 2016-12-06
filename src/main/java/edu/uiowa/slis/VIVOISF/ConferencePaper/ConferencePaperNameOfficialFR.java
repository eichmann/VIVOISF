package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameOfficialFRIterator theConferencePaper = (ConferencePaperNameOfficialFRIterator)findAncestorWithClass(this, ConferencePaperNameOfficialFRIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

