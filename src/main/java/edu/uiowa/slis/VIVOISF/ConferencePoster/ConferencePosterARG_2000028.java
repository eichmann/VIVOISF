package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterARG_2000028Iterator theConferencePosterARG_2000028Iterator = (ConferencePosterARG_2000028Iterator)findAncestorWithClass(this, ConferencePosterARG_2000028Iterator.class);
			pageContext.getOut().print(theConferencePosterARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

