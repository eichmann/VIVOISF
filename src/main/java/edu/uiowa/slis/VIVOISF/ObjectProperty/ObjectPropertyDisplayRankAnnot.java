package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyDisplayRankAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertyDisplayRankAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyDisplayRankAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyDisplayRankAnnotIterator theObjectProperty = (ObjectPropertyDisplayRankAnnotIterator)findAncestorWithClass(this, ObjectPropertyDisplayRankAnnotIterator.class);
			pageContext.getOut().print(theObjectProperty.getDisplayRankAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for displayRankAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for displayRankAnnot tag ");
		}
		return SKIP_BODY;
	}
}

