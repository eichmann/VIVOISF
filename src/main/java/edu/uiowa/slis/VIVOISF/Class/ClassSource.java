package edu.uiowa.slis.VIVOISF.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClassSource currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassSource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassSourceIterator theClass = (ClassSourceIterator)findAncestorWithClass(this, ClassSourceIterator.class);
			pageContext.getOut().print(theClass.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for source tag ");
		}
		return SKIP_BODY;
	}
}

