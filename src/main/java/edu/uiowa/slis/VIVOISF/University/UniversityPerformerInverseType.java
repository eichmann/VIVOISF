package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityPerformerInverseIterator theUniversityPerformerInverseIterator = (UniversityPerformerInverseIterator)findAncestorWithClass(this, UniversityPerformerInverseIterator.class);
			pageContext.getOut().print(theUniversityPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for performer tag ");
		}
		return SKIP_BODY;
	}
}

