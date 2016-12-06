package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030ARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030ARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030ARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030ARG_2000028Iterator theIAO_0000030ARG_2000028Iterator = (IAO_0000030ARG_2000028Iterator)findAncestorWithClass(this, IAO_0000030ARG_2000028Iterator.class);
			pageContext.getOut().print(theIAO_0000030ARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

