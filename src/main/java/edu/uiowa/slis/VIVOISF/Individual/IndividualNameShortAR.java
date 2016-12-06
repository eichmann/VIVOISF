package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameShortARIterator theIndividual = (IndividualNameShortARIterator)findAncestorWithClass(this, IndividualNameShortARIterator.class);
			pageContext.getOut().print(theIndividual.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

