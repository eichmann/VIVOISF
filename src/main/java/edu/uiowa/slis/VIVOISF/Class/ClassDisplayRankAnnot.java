package edu.uiowa.slis.VIVOISF.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassDisplayRankAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClassDisplayRankAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassDisplayRankAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassDisplayRankAnnotIterator theClass = (ClassDisplayRankAnnotIterator)findAncestorWithClass(this, ClassDisplayRankAnnotIterator.class);
			pageContext.getOut().print(theClass.getDisplayRankAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for displayRankAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for displayRankAnnot tag ");
		}
		return SKIP_BODY;
	}
}

