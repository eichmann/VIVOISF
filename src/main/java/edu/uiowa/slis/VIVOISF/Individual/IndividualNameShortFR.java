package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameShortFRIterator theIndividual = (IndividualNameShortFRIterator)findAncestorWithClass(this, IndividualNameShortFRIterator.class);
			pageContext.getOut().print(theIndividual.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

