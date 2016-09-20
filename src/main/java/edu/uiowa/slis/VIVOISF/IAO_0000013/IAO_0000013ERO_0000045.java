package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013ERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013ERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013ERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013ERO_0000045Iterator theIAO_0000013 = (IAO_0000013ERO_0000045Iterator)findAncestorWithClass(this, IAO_0000013ERO_0000045Iterator.class);
			pageContext.getOut().print(theIAO_0000013.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

