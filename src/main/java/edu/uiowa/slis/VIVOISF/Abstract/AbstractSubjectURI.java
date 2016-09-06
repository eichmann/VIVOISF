package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Abstract theAbstract = (Abstract)findAncestorWithClass(this, Abstract.class);
			if (!theAbstract.commitNeeded) {
				pageContext.getOut().print(theAbstract.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Abstract theAbstract = (Abstract)findAncestorWithClass(this, Abstract.class);
			return theAbstract.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Abstract for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Abstract theAbstract = (Abstract)findAncestorWithClass(this, Abstract.class);
			theAbstract.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for subjectURI tag ");
		}
	}
}

