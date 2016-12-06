package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030RO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030RO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030RO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030RO_0002234Iterator theIAO_0000030RO_0002234Iterator = (IAO_0000030RO_0002234Iterator)findAncestorWithClass(this, IAO_0000030RO_0002234Iterator.class);
			pageContext.getOut().print(theIAO_0000030RO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

