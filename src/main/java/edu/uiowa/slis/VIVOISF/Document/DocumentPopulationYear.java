package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPopulationYearIterator theDocument = (DocumentPopulationYearIterator)findAncestorWithClass(this, DocumentPopulationYearIterator.class);
			pageContext.getOut().print(theDocument.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

