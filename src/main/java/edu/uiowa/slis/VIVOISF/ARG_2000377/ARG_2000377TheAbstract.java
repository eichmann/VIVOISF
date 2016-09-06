package edu.uiowa.slis.VIVOISF.ARG_2000377;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000377TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000377TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000377TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000377TheAbstractIterator theARG_2000377 = (ARG_2000377TheAbstractIterator)findAncestorWithClass(this, ARG_2000377TheAbstractIterator.class);
			pageContext.getOut().print(theARG_2000377.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000377 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000377 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

