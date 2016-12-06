package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameShortESIterator theIndividual = (IndividualNameShortESIterator)findAncestorWithClass(this, IndividualNameShortESIterator.class);
			pageContext.getOut().print(theIndividual.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

