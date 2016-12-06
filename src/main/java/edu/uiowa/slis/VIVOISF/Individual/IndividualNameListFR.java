package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameListFRIterator theIndividual = (IndividualNameListFRIterator)findAncestorWithClass(this, IndividualNameListFRIterator.class);
			pageContext.getOut().print(theIndividual.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

