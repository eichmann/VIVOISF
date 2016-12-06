package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualFreetextKeywordIterator theIndividual = (IndividualFreetextKeywordIterator)findAncestorWithClass(this, IndividualFreetextKeywordIterator.class);
			pageContext.getOut().print(theIndividual.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

