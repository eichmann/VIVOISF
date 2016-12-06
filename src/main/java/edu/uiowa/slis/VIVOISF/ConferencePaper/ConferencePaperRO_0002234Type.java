package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperRO_0002234Iterator theConferencePaperRO_0002234Iterator = (ConferencePaperRO_0002234Iterator)findAncestorWithClass(this, ConferencePaperRO_0002234Iterator.class);
			pageContext.getOut().print(theConferencePaperRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

