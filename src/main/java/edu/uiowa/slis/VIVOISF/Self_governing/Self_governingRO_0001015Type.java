package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Self_governingRO_0001015Iterator theSelf_governingRO_0001015Iterator = (Self_governingRO_0001015Iterator)findAncestorWithClass(this, Self_governingRO_0001015Iterator.class);
			pageContext.getOut().print(theSelf_governingRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

