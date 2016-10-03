package edu.uiowa.slis.VIVOISF.ARG_2000376;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000376MemberInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000376MemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000376MemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000376MemberInverseIterator theARG_2000376MemberInverseIterator = (ARG_2000376MemberInverseIterator)findAncestorWithClass(this, ARG_2000376MemberInverseIterator.class);
			pageContext.getOut().print(theARG_2000376MemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000376 for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000376 for member tag ");
		}
		return SKIP_BODY;
	}
}

