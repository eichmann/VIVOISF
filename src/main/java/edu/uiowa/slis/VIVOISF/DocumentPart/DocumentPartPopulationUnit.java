package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartPopulationUnitIterator theDocumentPart = (DocumentPartPopulationUnitIterator)findAncestorWithClass(this, DocumentPartPopulationUnitIterator.class);
			pageContext.getOut().print(theDocumentPart.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

