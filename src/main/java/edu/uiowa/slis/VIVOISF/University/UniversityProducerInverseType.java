package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityProducerInverseIterator theUniversityProducerInverseIterator = (UniversityProducerInverseIterator)findAncestorWithClass(this, UniversityProducerInverseIterator.class);
			pageContext.getOut().print(theUniversityProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for producer tag ");
		}
		return SKIP_BODY;
	}
}

