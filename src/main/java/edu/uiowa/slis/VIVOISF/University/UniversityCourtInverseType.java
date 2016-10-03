package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityCourtInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityCourtInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityCourtInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityCourtInverseIterator theUniversityCourtInverseIterator = (UniversityCourtInverseIterator)findAncestorWithClass(this, UniversityCourtInverseIterator.class);
			pageContext.getOut().print(theUniversityCourtInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for court tag ");
		}
		return SKIP_BODY;
	}
}

