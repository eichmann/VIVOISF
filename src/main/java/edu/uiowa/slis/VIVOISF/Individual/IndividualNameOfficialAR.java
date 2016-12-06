package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameOfficialARIterator theIndividual = (IndividualNameOfficialARIterator)findAncestorWithClass(this, IndividualNameOfficialARIterator.class);
			pageContext.getOut().print(theIndividual.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

