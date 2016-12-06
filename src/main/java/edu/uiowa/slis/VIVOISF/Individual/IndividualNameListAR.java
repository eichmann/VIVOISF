package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameListARIterator theIndividual = (IndividualNameListARIterator)findAncestorWithClass(this, IndividualNameListARIterator.class);
			pageContext.getOut().print(theIndividual.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

