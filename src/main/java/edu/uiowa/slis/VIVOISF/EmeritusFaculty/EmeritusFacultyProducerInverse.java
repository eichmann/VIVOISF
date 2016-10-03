package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyProducerInverseIterator theEmeritusFacultyProducerInverseIterator = (EmeritusFacultyProducerInverseIterator)findAncestorWithClass(this, EmeritusFacultyProducerInverseIterator.class);
			pageContext.getOut().print(theEmeritusFacultyProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for producer tag ");
		}
		return SKIP_BODY;
	}
}

