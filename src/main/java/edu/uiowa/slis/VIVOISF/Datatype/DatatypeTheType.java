package edu.uiowa.slis.VIVOISF.Datatype;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypeTheType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypeTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypeTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypeTheTypeIterator theDatatype = (DatatypeTheTypeIterator)findAncestorWithClass(this, DatatypeTheTypeIterator.class);
			pageContext.getOut().print(theDatatype.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing Datatype for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing Datatype for theType tag ");
		}
		return SKIP_BODY;
	}
}

