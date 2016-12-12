package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Self_governingBFO_0000051Iterator theSelf_governingBFO_0000051Iterator = (Self_governingBFO_0000051Iterator)findAncestorWithClass(this, Self_governingBFO_0000051Iterator.class);
			pageContext.getOut().print(theSelf_governingBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

