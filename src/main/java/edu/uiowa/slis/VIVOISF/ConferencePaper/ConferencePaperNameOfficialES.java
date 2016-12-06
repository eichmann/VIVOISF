package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameOfficialESIterator theConferencePaper = (ConferencePaperNameOfficialESIterator)findAncestorWithClass(this, ConferencePaperNameOfficialESIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

