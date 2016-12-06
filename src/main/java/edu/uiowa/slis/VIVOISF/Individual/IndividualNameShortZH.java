package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameShortZHIterator theIndividual = (IndividualNameShortZHIterator)findAncestorWithClass(this, IndividualNameShortZHIterator.class);
			pageContext.getOut().print(theIndividual.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

