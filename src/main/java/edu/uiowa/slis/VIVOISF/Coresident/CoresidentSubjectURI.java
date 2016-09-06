package edu.uiowa.slis.VIVOISF.Coresident;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoresidentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoresidentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CoresidentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Coresident theCoresident = (Coresident)findAncestorWithClass(this, Coresident.class);
			if (!theCoresident.commitNeeded) {
				pageContext.getOut().print(theCoresident.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Coresident for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coresident for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Coresident theCoresident = (Coresident)findAncestorWithClass(this, Coresident.class);
			return theCoresident.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Coresident for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coresident for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Coresident theCoresident = (Coresident)findAncestorWithClass(this, Coresident.class);
			theCoresident.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Coresident for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coresident for subjectURI tag ");
		}
	}
}

