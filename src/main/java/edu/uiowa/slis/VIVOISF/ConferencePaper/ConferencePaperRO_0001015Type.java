package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperRO_0001015Iterator theConferencePaperRO_0001015Iterator = (ConferencePaperRO_0001015Iterator)findAncestorWithClass(this, ConferencePaperRO_0001015Iterator.class);
			pageContext.getOut().print(theConferencePaperRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

