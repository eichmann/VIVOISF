package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperARG_2000028Iterator theConferencePaperARG_2000028Iterator = (ConferencePaperARG_2000028Iterator)findAncestorWithClass(this, ConferencePaperARG_2000028Iterator.class);
			pageContext.getOut().print(theConferencePaperARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

