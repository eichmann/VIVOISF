package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379HasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379HasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379HasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379HasTitleIterator theARG_2000379HasTitleIterator = (ARG_2000379HasTitleIterator)findAncestorWithClass(this, ARG_2000379HasTitleIterator.class);
			pageContext.getOut().print(theARG_2000379HasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

