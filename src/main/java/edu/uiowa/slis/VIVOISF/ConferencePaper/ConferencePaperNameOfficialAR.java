package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameOfficialARIterator theConferencePaper = (ConferencePaperNameOfficialARIterator)findAncestorWithClass(this, ConferencePaperNameOfficialARIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

