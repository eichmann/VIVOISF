package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameOfficialZHIterator theConferencePaper = (ConferencePaperNameOfficialZHIterator)findAncestorWithClass(this, ConferencePaperNameOfficialZHIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

