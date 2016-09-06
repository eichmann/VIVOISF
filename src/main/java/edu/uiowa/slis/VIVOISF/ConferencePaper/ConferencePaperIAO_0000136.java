package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperIAO_0000136Iterator theConferencePaperIAO_0000136Iterator = (ConferencePaperIAO_0000136Iterator)findAncestorWithClass(this, ConferencePaperIAO_0000136Iterator.class);
			pageContext.getOut().print(theConferencePaperIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

