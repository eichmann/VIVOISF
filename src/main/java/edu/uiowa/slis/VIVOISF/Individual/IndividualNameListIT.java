package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameListITIterator theIndividual = (IndividualNameListITIterator)findAncestorWithClass(this, IndividualNameListITIterator.class);
			pageContext.getOut().print(theIndividual.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

