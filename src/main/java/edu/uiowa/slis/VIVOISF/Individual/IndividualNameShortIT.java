package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameShortITIterator theIndividual = (IndividualNameShortITIterator)findAncestorWithClass(this, IndividualNameShortITIterator.class);
			pageContext.getOut().print(theIndividual.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

