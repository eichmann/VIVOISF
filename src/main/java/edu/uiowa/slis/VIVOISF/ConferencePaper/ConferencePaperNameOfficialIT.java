package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameOfficialITIterator theConferencePaper = (ConferencePaperNameOfficialITIterator)findAncestorWithClass(this, ConferencePaperNameOfficialITIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

