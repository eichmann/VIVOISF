package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379HasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379HasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379HasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379HasEmailIterator theARG_2000379HasEmailIterator = (ARG_2000379HasEmailIterator)findAncestorWithClass(this, ARG_2000379HasEmailIterator.class);
			pageContext.getOut().print(theARG_2000379HasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

