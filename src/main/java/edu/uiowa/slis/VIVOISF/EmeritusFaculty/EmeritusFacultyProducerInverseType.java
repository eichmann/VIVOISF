package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyProducerInverseIterator theEmeritusFacultyProducerInverseIterator = (EmeritusFacultyProducerInverseIterator)findAncestorWithClass(this, EmeritusFacultyProducerInverseIterator.class);
			pageContext.getOut().print(theEmeritusFacultyProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for producer tag ");
		}
		return SKIP_BODY;
	}
}

