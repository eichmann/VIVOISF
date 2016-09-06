package edu.uiowa.slis.VIVOISF.ARG_2000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000009Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000009Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000009Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000009DoiIterator theARG_2000009 = (ARG_2000009DoiIterator)findAncestorWithClass(this, ARG_2000009DoiIterator.class);
			pageContext.getOut().print(theARG_2000009.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000009 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000009 for doi tag ");
		}
		return SKIP_BODY;
	}
}

