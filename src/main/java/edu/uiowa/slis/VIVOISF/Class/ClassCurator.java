package edu.uiowa.slis.VIVOISF.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassCurator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClassCurator currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassCurator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassCuratorIterator theClass = (ClassCuratorIterator)findAncestorWithClass(this, ClassCuratorIterator.class);
			pageContext.getOut().print(theClass.getCurator());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for curator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for curator tag ");
		}
		return SKIP_BODY;
	}
}

