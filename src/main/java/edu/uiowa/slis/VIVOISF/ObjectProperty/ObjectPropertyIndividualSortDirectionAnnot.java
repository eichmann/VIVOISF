package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyIndividualSortDirectionAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertyIndividualSortDirectionAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyIndividualSortDirectionAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyIndividualSortDirectionAnnotIterator theObjectProperty = (ObjectPropertyIndividualSortDirectionAnnotIterator)findAncestorWithClass(this, ObjectPropertyIndividualSortDirectionAnnotIterator.class);
			pageContext.getOut().print(theObjectProperty.getIndividualSortDirectionAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for individualSortDirectionAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for individualSortDirectionAnnot tag ");
		}
		return SKIP_BODY;
	}
}

